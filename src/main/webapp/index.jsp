<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" session="false" %>

<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<title>Bikers</title>
	<meta  charset=UTF-8 />
	<link href="resources/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="page">
        <c:import url="/uiBuilder/menu/topMenu"/>
        <c:import url="/uiBuilder/menu/mainMenu"/>
		<div id="body">
			<div id="main">
				<h2>Привіт, я Java програміст з міста Умань.</h2>
                <h3>А тепер трішки про мене.</h3>
				<div class="featured"> <!-- start of featured -->
					<a href="about.htm"><img src="resources/images/home-biker.jpg"  width="270" height="180" alt="Bikers Club" title="Bikers Club"></a>
					<a href="about.htm"><img src="resources/images/home-bikers.jpg" width="270" height="180" alt="Bikers Club" title="Bikers Club"></a>
					<p>
						This website template has been designed by <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a> for you, for free. You can replace all this text with your own text.
						You can remove any link to our website from this website template, you're free to use this website template without linking back to us.
					</p>
					<p>Looking for more templates? Just browse through all our <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a> and find what you&acute;re looking for. But if you don&acute;t find any website template you can use, you can try our <a href="http://www.freewebsitetemplates.com/freewebdesign/">Free Web Design</a> service and tell us all about it.</p>
				</div> <!-- end of featured -->

				<div class="section" > <!-- srtart of gallery and article section -->
					<div id="gallery">
						<h3>Photo Gallery</h3>
						<ul>
							<li><a href="gallery.htm"><img src="resources/images/home-biker-thumbnail.jpg" width="125" height="80" alt="Bikers Club" title="Bikers Club"></a></li>
							<li><a href="gallery.htm"><img src="resources/images/home-boys.jpg" width="125" height="80" alt="Bikers Club" title="Bikers Club"></a></li>
							<li><a href="gallery.htm"><img src="resources/images/home-girls.jpg" width="125" height="80" alt="Bikers Club" title="Bikers Club"></a></li>
							<li><a href="gallery.htm"><img src="resources/images/home-family.jpg" width="125" height="80" alt="Bikers Club" title="Bikers Club"></a></li>
						</ul>
						<a class="more" href="gallery.htm">View more &#187;</a> 
					</div>

					<div id="events">
						<h3>Events</h3>
						<ul>
							<li>Aenean at risus quam, et semper nunc. Sed mollis arcu at augue facilisis a congue turpis</li>
							<li>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac</li>
							<li class="last">Duis dui enim, gravida at hendrerit id, molestie eget quam. Phasellus posuere nunc vitae ipsum aliquam et lobortis</li>
						</ul>
						<a class="more" href="events.htm">Read more &raquo;</a> 
					</div>
				</div> <!-- end of gallery and article section -->
			</div>

			<div id="sidebar">  <!-- start of sidebar -->
				<ul>
					<li>
						<h3><a href="about.htm">Proin sollicitudin dignissim ligula sed vestibulum.</a></h3>
						<p>Vestibulum sed magna eu justo tempor facilisis sed ut felis. Ut vitae tortor neque, convallis lobortis enim.</p>
					</li>
					<li>
						<h3><a href="about.htm"> Quisque purus nisl, feugiat  vitae convallis eu</a></h3>
						<p>Nulla nunc magna, fringillavitae mattis insuscipitausto. Fusce laoreet, velit non feugiat laoreet, sem massa convallis tellus, et rutrum velit erat.</p>
					</li>
					<li>
						<h3><a href="about.htm">Nunc ullamcorper, velit quis  mattis eleifend </a></h3>
						<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla tortor mauris, tempus in convallis in.</p>
					</li>
				</ul>

				<h3>Get In Touch</h3>
				<form>
					<table>
						<tr><td><input type="text" name="" value="Name" onblur="if(this.value==''){this.value=this.defaultValue;}" onfocus="if(this.value==this.defaultValue){this.value='';}" /></td></tr>
						<tr><td><input type="text" name="" value="Email" onblur="if(this.value==''){this.value=this.defaultValue;}" onfocus="if(this.value==this.defaultValue){this.value='';}" /></td></tr>
						<tr><td><textarea name="message" onblur="if(this.value==''){this.value=this.defaultValue;}" onfocus="if(this.value==this.defaultValue){this.value='';}">Message</textarea></td></tr>
						<tr><td><input type="submit" value="" class="button" /></td></tr>
					</table>
				</form>
			</div>  <!-- end of sidebar -->
		</div>  <!-- end of body wrapper -->
	</div>
    <%@ include file="WEB-INF/views/footer.jsp"%>
</body>
</html>
