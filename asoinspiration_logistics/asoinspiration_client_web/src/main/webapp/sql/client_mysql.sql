/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : client

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for company_c
-- ----------------------------
DROP TABLE IF EXISTS `company_c`;
CREATE TABLE `company_c`  (
  `COMPANY_ID` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_ID` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `CNAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `LINKMAN` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `TELEPHONE` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `FAX` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ADDRESS` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`COMPANY_ID`) USING BTREE,
  INDEX `FK_COMPANY__REFERENCE_USER_C`(`USER_ID`) USING BTREE,
  CONSTRAINT `FK_COMPANY__REFERENCE_USER_C` FOREIGN KEY (`USER_ID`) REFERENCES `user_c` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_c
-- ----------------------------
DROP TABLE IF EXISTS `user_c`;
CREATE TABLE `user_c`  (
  `USER_ID` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `PASSWORD` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EMAIL` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `TELEPHONE` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `DEGREE` int(11) DEFAULT NULL,
  `STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for userinfo_c
-- ----------------------------
DROP TABLE IF EXISTS `userinfo_c`;
CREATE TABLE `userinfo_c`  (
  `USER_ID` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ENAME` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `CODE_TYPE` int(11) DEFAULT NULL,
  `CODE_NO` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `QQ` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `PIC` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE,
  CONSTRAINT `FK_USERINFO_REFERENCE_USER_C` FOREIGN KEY (`USER_ID`) REFERENCES `user_c` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
