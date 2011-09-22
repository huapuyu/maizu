<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="<s:url value='theme/style.css'/>" />
<title>麦房</title>
</head>
<body>
	<div id="main_container">

		<div id="header">

			<div id="logo">
			
				<a href="index.html"><img src="<s:url value='theme/images/logo.gif'/>" width="147"
					height="78" alt="" title="" border="0" /> </a>
			</div>

			<div class="banner_adds"></div>


			<div class="menu">

				<ul>
					<li><a href="index.html">主页</a></li>
					<li><a href="navigator.html">发布信息</a>
					</li>
					<li><a href="">关于我们</a></li>
					<li><a href="">合作伙伴</a></li>
					<li><a href="">常见问题</a></li>
					<li><a href="contact.html">联系我们</a></li>

				</ul>

			</div>
			<form name="form" action="index.html" method="post">
				<input type="text" id="pid" name="name" />
				<input type="submit">
			</form>





		</div>



		<div id="main_content">
			<div class="column1">


				<div class="left_box">
					<div class="top_left_box"></div>
					<div class="center_left_box">
						<div class="box_title">
							<span>搜</span> 房源:
						</div>


						<div class="form">
							<div class="form_row">
								<label class="left">城市: </label><input type="text"
									class="form_input" />
							</div>
							<div class="form_row">
								<label class="left">价格从: </label><input type="text"
									class="form_input" />
							</div>
							<div class="form_row">
								<label class="left">到: </label><input type="text"
									class="form_input"/>
							</div>

							<div class="form_row">
								<label class="left_long">房源类型:</label>
							</div>
							<div class="form_row">
								<input type="radio" name="reason" /> 全部
							</div>
							<div class="form_row">
								<input type="radio" name="reason" /> 求购
							</div>
							<div class="form_row">
								<input type="radio" name="reason" /> 求租
							</div>

							<div style="float: right; padding: 10px 25px 0 0;">
								<input type="image" src="<s:url value='theme/images/find.gif'/>" />
							</div>

						</div>


					</div>
					<div class="bottom_left_box"></div>
				</div>



				<div class="left_box">
					<div class="top_left_box"></div>
					<div class="center_left_box">
						<div class="box_title">
							<span>搜</span> 发起人:
						</div>


						<div class="form">
							<div class="form_row">
								<label class="left">电话: </label><input type="text"
									class="form_input" />
							</div>
							<div style="float: right; padding: 10px 25px 0 0;">
								<input type="image" src="<s:url value='theme/images/find.gif'/>" />
							</div>

						</div>


					</div>
					<div class="bottom_left_box"></div>
				</div>


				<div class="left_box">
					<div class="top_left_box"></div>
					<div class="center_left_box">
						<div class="box_title">
							<span>联系</span> 我们:
						</div>


						<div class="form">
							<div class="form_row">
								<img src="<s:url value='theme/images/contact_envelope.gif'/>" width="50" height="47"
									border="0" class="img_right" alt="" title="" />
								<div class="contact_information">
									Email: info@comapnyname.com<br /> Telephone: 0234 789 90<br />
									Mobile: 234 345 234534<br /> Fax: 34534 3456 3456(54)<br /> <br />
									<span>www.anders.com</span>
								</div>
							</div>
						</div>


					</div>
					<div class="bottom_left_box"></div>
				</div>









			</div>
			<!-- end of column one -->

			<div class="column2">
				<div class="main_text_box">
					<h2>关于我们</h2>
					<p>
						一个很牛的公司
					</p>
				</div>

				<div class="main_text_box">
					<h2>留言</h2>
					<div class="proposal">
						<p class="proposal_text">很实用的网站啊！</p>
					</div>
				</div>




			</div>
			<!-- end of column two -->





			<div class="column3">
				<div class="small_title">二手房</div>

				<div class="offer_box">
					<a href="details.htm"><img src="<s:url value='theme/images/p1.jpg'/>" width="130"
						height="98" class="img_left" alt="" title="" border="0" /> </a>
					<div class="offer_info">
						<span>整租</span>
						<p class="offer">"位置好，交通便利，周围设施齐全."</p>
						<div class="more">
							<a href="details.htm">...详情</a>
						</div>
					</div>
				</div>


				<div class="offer_box">
					<a href="details.htm"><img src="<s:url value='theme/images/p1.jpg'/>" width="130"
						height="98" class="img_left" alt="" title="" border="0" /> </a>
					<div class="offer_info">
						<span>合租</span>
						<p class="offer">"位置好，交通便利，周围设施齐全"</p>
						<div class="more">
							<a href="details.htm">...详情</a>
						</div>
					</div>
				</div>

			</div>
			<!-- end of column three -->





			<div class="column4">

				<div class="title">Special Offers</div>

				<div class="offer_box_wide">
					<a href="details.htm"><img src="<s:url value='theme/images/p1.jpg'/>" width="130"
						height="98" class="img_left" alt="" title="" border="0" /> </a>
					<div class="offer_info">
						<span>150 万元</span>
						<p class="offer">"位置好，交通便利，周围设施齐全"</p>
						<div class="more">
							<a href="details.htm">...详情</a>
						</div>
					</div>
				</div>


				<div class="offer_box_wide">
					<a href="details.htm"><img src="<s:url value='theme/images/p2.jpg'/>" width="130"
						height="98" class="img_left" alt="" title="" border="0" /> </a>
					<div class="offer_info">
						<span>200 万元</span>
						<p class="offer">"位置好，交通便利，周围设施齐全"</p>
						<div class="more">
							<a href="details.htm">...详情</a>
						</div>
					</div>
				</div>


				<div class="offer_box_wide">
					<a href="details.htm"><img src="<s:url value='theme/images/p2.jpg'/>" width="130"
						height="98" class="img_left" alt="" title="" border="0" /> </a>
					<div class="offer_info">
						<span>150 万元</span>
						<p class="offer">"位置好，交通便利，周围设施齐全"</p>
						<div class="more">
							<a href="" target="_blank">...详情</a>
						</div>
					</div>
				</div>


				<div class="offer_box_wide">
					<a href="details.htm"><img src="<s:url value='theme/images/p2.jpg'/>" width="130"
						height="98" class="img_left" alt="" title="" border="0" /> </a>
					<div class="offer_info">
						<span>200 万元</span>
						<p class="offer">"位置好，交通便利，周围设施齐全."</p>
						<div class="more">
							<a href="details.htm">...详情</a>
						</div>
					</div>
				</div>





			</div>
			<!-- end of column four -->




		</div>
		<!-- end of main_content -->

		<div id="footer">

			<div id="copyright">
				<div style="float: left; padding: 3px;">
					<a href="" target="_blank"><img
						src="<s:url value='theme/images/footer_logo.gif'/>" width="42" height="35" alt=""
						title="" border="0" /> </a>
				</div>
				<div style="float: left; padding: 14px 10px 10px 10px;">
					Company name.&copy; All Rights Reserved 2008 - By <a
						href="" style="color: #772c17;">竹器</a>
				</div>
			</div>


			<ul class="footer_menu">
				<li><a href="index.htm" class="nav_footer"> Home </a></li>
				<li><a href="" target="_blank"
					class="nav_footer"> Selling Homes </a></li>
				<li><a href="" class="nav_footer"> Buying Homes </a></li>
				<li><a href="" class="nav_footer"> Renting Homes</a></li>
				<li><a href="" class="nav_footer"> RSS </a></li>
				<li><a href="" class="nav_footer"> Contact </a></li>
				<li><a href="" class="nav_footer">
						竹器 </a></li>
			</ul>

		</div>
	</div>
</body>
</html>