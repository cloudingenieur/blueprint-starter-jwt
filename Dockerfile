FROM jelastic/maven:3.9.5-openjdk-22.ea-b19

RUN mkdir /code

COPY . /code

WORKDIR /code

#RUN cp application.properties.docker src/main/resources/application.properties

RUN chmod 755 /code/start.sh

ENTRYPOINT [ "sh", "/code/start.sh"]

# Fix docker later