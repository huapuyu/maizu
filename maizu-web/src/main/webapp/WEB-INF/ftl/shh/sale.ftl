<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] />

<@s.form action="login">
	<@s.textfield name="username" label="username" />
	<@s.submit value="login" />
</@s.form>