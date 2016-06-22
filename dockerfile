FROM java:8
ADD *.jar given.jar
ADD start.sh start.sh
ADD hosts /etc/hosts
RUN chmod 777 start.sh
RUN bash -c 'touch /given.jar'
EXPOSE 9000
ENTRYPOINT ["/start.sh"]
