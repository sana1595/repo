FROM ubuntu:14.04

# Install Java.
RUN \
  apt-get update && \
  apt-get install -y openjdk-7-jdk 

# Define working directory.
WORKDIR /data

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

# Define default command.
CMD ["bash"]
