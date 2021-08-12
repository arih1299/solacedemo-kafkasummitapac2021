Sample AsyncAPI spec file used to generate the demo applications:
- DoctorMobileApp.yaml
- PatientDataProcessor.yaml
- PatientMobileApp.yaml

Export of the 'completed' application domain:
- SoHealthy Personalised Healthcare Domain.json

You can import this file into your Solace Event Portal Designer.


Sample of exposed Event API:
- PatientDataRaw.yaml

You can use this as reference, to generate documentation, or to generate consuming application with this command sample:
```
$ npm install -g @asyncapi/generator
$ ag -o newapp ./PatientDataRaw.yaml -p javaPackage=com.solace.demo.sohealthy -p view=provider @asyncapi/java-spring-cloud-stream-template
```
Please refer to https://github.com/asyncapi/generator
