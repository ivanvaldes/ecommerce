# Derived from official mysql image (our base image)
FROM mysql

# Add a database
ENV MYSQL_DATABASE ecommerce

# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/

#Run commands
RUN apt-get update && apt-get install -y \
vim
RUN   echo "bind-address    = 0.0.0.0" >> /etc/mysql/my.cnf
RUN   echo "default_authentication_plugin=mysql_native_password" >> /etc/mysql/my.cnf