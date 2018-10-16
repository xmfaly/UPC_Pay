# upc_pay
石油大学缴费后台对接项目
### 项目介绍
该项目和石油大学的财务平台，微信企业号对接，快速创建和管理微信缴费页面。
后端采用`spring-boot`
前端采用`vue`


### 2018年7月19日更新说明
1. 优化缴费页面，扩大边距，使能在更多手机上正常的显示
2. 可以在一个项目中创建多条收费项（收费项默认一条，必须大于等于一条）
![t](doc/8.png)
![t](doc/9.png)
3. 必填参数可以设置成用户选择的方式    
![t](doc/10.png)
![t](doc/11.png)

## 参数说明
### 缴费名称
对应生成页面的标题  

![t](doc/1.png)

### 缴费类型
如果是对于校内用户使用可以选择`校内用户缴费`对于校外用户选择`校外用户缴费`如果选择`校外用户缴费`，必须填上两个参数，这两个参数一般用于身份识别，比如身份证手机号之类的。可以勾选后面对应的校验规则，后台会在提交用户缴费的时候辅助校验。校内用户后台会自动识别身份。 如果选择校内缴费，请确保所有的用户为校内用户。  

![t](doc/2.png)

### 是否定项
如果选择不定项，则用户可以手动输入要缴费的金额  

![t](doc/3.png)
如果选择定项目，需要同时设定项目的名称和对应的缴费金额  

![t](doc/4.png)

## 可能出现的问题及解决方案

### 1  

![t](doc/5.png)
如果`是否定项`选择`定项`则必须输入`至少一个`项目，并且项目的`金额必须为数字`。

### 2
![t](doc/6.png)  

请确保`subsysid` `sysid` `feeitemid` `cert` 四个参数是正确的，可以在`缴费管理`界面中选择`编辑`按钮进行查看和修改  

![t](doc/7.png)  

### 3.二维码不小心遗失或忘记保存了
在`缴费管理`中选择`编辑`即可再次查看到二维码  

![t](doc/7.png)
### 其他问题
如果遇到了其他的问题或错误，请保留出现问题的时间段以及出现问题原因，或者参数，把这些信息给我，我会帮你解决。
联系 qq 710801583


