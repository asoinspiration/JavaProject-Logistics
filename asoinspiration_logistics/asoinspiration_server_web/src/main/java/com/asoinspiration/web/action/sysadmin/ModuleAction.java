package com.asoinspiration.web.action.sysadmin;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import com.asoinspiration.domain.Module;
import com.asoinspiration.service.ModuleService;
import com.asoinspiration.utils.Page;
import com.asoinspiration.web.action.BaseAction;
import com.opensymphony.xwork2.ModelDriven;



@Namespace("/sysadmin")
@Result(name = "alist", type = "redirectAction", location = "moduleAction_list")
public class ModuleAction extends BaseAction implements ModelDriven<Module> {

	@Autowired
	private ModuleService moduleService;

	private Module model = new Module();

	@Override
	public Module getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	private Page page = new Page();

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Action(value = "moduleAction_list", results = {
			@Result(name = "list", location = "/WEB-INF/pages/sysadmin/module/jModuleList.jsp") })
	public String list() throws Exception {
		// TODO Auto-generated method stub

		org.springframework.data.domain.Page<Module> page2 = moduleService.findPage(null,
				new PageRequest(page.getPageNo() - 1, page.getPageSize()));

		page.setTotalPage(page2.getTotalPages()); // 总页数
		page.setTotalRecord(page2.getTotalElements()); // 总记录数
		page.setResults(page2.getContent()); // 查询的记录
		page.setUrl("moduleAction_list"); // 上下页跳转的地址(相对路径地址)

		super.push(page);

		return "list";
	}

	/**
	 * 查看单个角色
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "moduleAction_toview", results = {
			@Result(name = "toview", location = "/WEB-INF/pages/sysadmin/module/jModuleView.jsp") })
	public String toview() throws Exception {
		// TODO Auto-generated method stub
		// 先根据id从数据库中查询
		Module module = moduleService.get(model.getId());

		super.push(module);

		return "toview";
	}

	/**
	 * 去新增页面
	 */
	@Action(value = "moduleAction_tocreate", results = {
			@Result(name = "tocreate", location = "/WEB-INF/pages/sysadmin/module/jModuleCreate.jsp") })
	public String tocreate() throws Exception {
		

		return "tocreate";
	}

	/**
	 * 新增方法
	 * 
	 */
	@Action(value = "moduleAction_insert", results = {
			@Result(name = "alist", type = "redirectAction", location = "moduleAction_list") })
	public String insert() throws Exception {
		// TODO Auto-generated method stub
		moduleService.saveOrUpdate(model); // 查部门的默认状态

		return "alist";
	}

	/**
	 * 去修改页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "moduleAction_toupdate", results = {
			@Result(name = "toupdate", location = "/WEB-INF/pages/sysadmin/module/jModuleUpdate.jsp") })
	public String toupdate() throws Exception {
		// TODO Auto-generated method stub
		// 1.根据id查询部门对象，压入值栈中
		Module module = moduleService.get(model.getId());

		super.push(module);

		return "toupdate";
	}
	
	
	/**
	 * 删除修改方法
	 * @return
	 * @throws Exception
	 */
	@Action(value="moduleAction_update", results = {
			@Result(name = "alist", type = "redirectAction", location = "moduleAction_list") })
	public String update() throws Exception {
		// TODO Auto-generated method stub
		// 根据id查询数据库的对象
		Module module = moduleService.get(model.getId());
		module.setName(model.getName());
		module.setLayerNum(model.getLayerNum());
		module.setRemark(model.getRemark());
		module.setCpermission(model.getCpermission());
		module.setCurl(model.getCurl());
		module.setCtype(model.getCtype());
		module.setState(model.getState());
		module.setBelong(model.getBelong());
		module.setCwhich(model.getCwhich());
		module.setRemark(model.getRemark());
		module.setOrderNo(model.getOrderNo());

		moduleService.saveOrUpdate(module);
		
		return "alist";
	}
	
	/**
	 * 角色删除
	 */
	@Action(value="moduleAction_delete")
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(model.getId());
		String[] ids = model.getId().split(", ");  //通过逗号空格切割成string数组
		moduleService.delete(ids);
		return "alist";
	}
	
	
}
