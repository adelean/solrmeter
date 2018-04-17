## NOTE
SolrMeter is still available for download but it's currently not under development. 

# What is SolrMeter?
## In one sentence
Standalone java tool for stress tests with Solr.

## In more than one sentence
The main goal of this open source project is bring to the solr user community a generic tool to interact specifically with solr, firing queries and adding documents to make sure that your Solr implementation will support the real use.
With SolrMeter you can simulate your work load over solr index and retrieve statistics graphically.
Dive into the [wiki](https://github.com/tflobbe/solrmeter/tree/wiki) to read more about SolrMeter...

# Want to use it?
Check the [Usage](https://github.com/tflobbe/solrmeter/blob/wiki/Usage.md) page in the project wiki.

# Using with Solr Cloud
This can be used with Solr cloud using the CloudSolrClient.  To enable this the user will need to set the following
```text
solr.server.configuration.useCloud=true
solr.searchUrl=zk1:2181,zk2:2181,zk3:2181
solr.addUrl=zk1:2181,zk2:2181,zk3:2181
solr.server.configuration.cloud.collection=techproducts
```

solr.server.configuration.useCloud defaults to "false".  solr.searchUrl and solr.addUrl will accept a Zookeeper string in place of an individual Solr instance URL. solr.server.configuration.cloud.collection defaults to techproducts.