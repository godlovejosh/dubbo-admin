## 去掉登录模块，添加自己的登录
	注释掉 WEB-INF/common/pipeline.xml 和 WEB-INF/common/pipeline-rpc.xml 中的权限验证AuthorizationValve
	注释掉 WEB-INF/templates/home/control/menu.vm 中的 "用户"部分<ul>列表,之所以全局搜索不到页面显示的一些文字,是因为做了国际化处理,文字都被统一使用Unicode编码保存在了message_zh.properties文件中
	
	