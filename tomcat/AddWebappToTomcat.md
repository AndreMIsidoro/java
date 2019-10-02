1st.) Copy your webapp to the DCOD tomcat.

2nd.) Try to connect to your webapp.

3rd.) Check in the catalina.out file (tomcat5/logs) if your webapp was deployed correctly.

4th.)Stop the firewall:

/etc/init.d/iptables stop

5th.) You should be able  to connect to your webapp using using the tomcat port (default 8080)

6th.) Go to the configuration folder:

	cd /etc/httpd/conf.d

7th.) You need to add to this folder a new proxy configuration folder: (webapp_test-test is the name of a webapp example)


# RewriteEngine on
# RewriteRule ^/webapp_test/(.*) https://%{HTTP_HOST}/webapp_test_test/$1 [NC,R=301,L]

<Proxy balancer://webapp_test_test_cluster>
 BalancerMember ajp://localhost:8009/webapp_test-test
</Proxy>
ProxyPass /webapp_test-test balancer://webapp_test_test_cluster


8th.) Restart httpd

	/etc/init.d/httpd restart

9th) Restart iptables

	/etc/init.d/iptables restart

10th) Try to connect to your webapp using port 8080. This should fail

11th) Try to connect to your webapp without specifying a port. This now should succeed.
