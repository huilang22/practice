/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bat.data.*;
public final class BatchRequestTemplateDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestTemplateDefinitionRequest (String request, BatchRequestTemplateDefinitionRequestMethod method) {
    initialize(request, "BatchRequestTemplateDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestTemplateDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionCreate(BatchRequestTemplateDefinitionObjectData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionDelete(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionFind(BatchRequestTemplateDefinitionObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionGet(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionRetrieve(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionUdtCreate(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionUdtCreateInUdtTemplateDataForBatchRequestTemplateDefinitionUdtCreate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData", data);
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionUdtGet(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionUdtUpdate(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionUdtUpdateInUdtTemplateDataForBatchRequestTemplateDefinitionUdtUpdate(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData", data);
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionUpdate(BatchRequestTemplateDefinitionObjectData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionXmlCreate(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionXmlCreateInXmlFileForBatchRequestTemplateDefinitionXmlCreate(String data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionXmlCreateInXmlFile", data);
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionXmlGet(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionForBatchRequestTemplateDefinitionXmlUpdate(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
  public void setBatchRequestTemplateDefinitionXmlUpdateInXmlFileForBatchRequestTemplateDefinitionXmlUpdate(String data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionXmlUpdateInXmlFile", data);
    }
  }
  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinitionObjectDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionCreate() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinitionObjectDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionDelete() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public BatchRequestTemplateDefinitionObjectDataList getBatchRequestTemplateDefinitionObjectDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionFind() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestTemplateDefinitionList");
  }
  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinitionObjectDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionGet() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public Object getObjectTemplateFromBatchRequestTemplateDefinitionRetrieve() {
    return (Object)outputMap.get("Template");
  }
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinitionObjectKeyDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionSequenceGet() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinitionObjectKeyDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionUdtCreate() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public BulkUdtTemplateRootRequest getBulkUdtTemplateRootRequestBatchRequestTemplateDefinitionUdtGetOutUdtTemplateDataFromBatchRequestTemplateDefinitionUdtGet() {
    return (BulkUdtTemplateRootRequest)outputMap.get("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData");
  }
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinitionObjectKeyDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionUdtUpdate() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinitionObjectDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionUpdate() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinitionObjectKeyDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionXmlCreate() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  public String getStringBatchRequestTemplateDefinitionXmlGetOutXmlFileFromBatchRequestTemplateDefinitionXmlGet() {
    return (String)outputMap.get("BatchRequestTemplateDefinitionXmlGetOutXmlFile");
  }
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinitionObjectKeyDataBatchRequestTemplateDefinitionFromBatchRequestTemplateDefinitionXmlUpdate() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionObjectFilter(BatchRequestTemplateDefinitionObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(data, new HashMap()).get("BatchRequestTemplateDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionObjectData(BatchRequestTemplateDefinitionObjectData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(data, new HashMap()).get("BatchRequestTemplateDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionObjectKeyData(BatchRequestTemplateDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestTemplateDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestTemplateDefinitionObjectDataList getBatchRequestTemplateDefinitionObjectDataList() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestTemplateDefinitionList");
  }
  /**
   @deprecated
   */
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinitionObjectKeyData() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  /**
   @deprecated
   */
  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinitionObjectData() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionUdtCreateInUdtTemplateData(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData", data);
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData(BulkUdtTemplateRootRequest data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData", data);
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionXmlCreateInXmlFile(String data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionXmlCreateInXmlFile", data);
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestTemplateDefinitionXmlUpdateInXmlFile(String data) {
    if (data != null) {
      addInput("BatchRequestTemplateDefinitionXmlUpdateInXmlFile", data);
    }
  }
  /**
   @deprecated
   */
  public Object getTemplate() {
    return (Object)outputMap.get("Template");
  }
  /**
   @deprecated
   */
  public BulkUdtTemplateRootRequest getBatchRequestTemplateDefinitionUdtGetOutUdtTemplateData() {
    return (BulkUdtTemplateRootRequest)outputMap.get("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData");
  }
  /**
   @deprecated
   */
  public String getBatchRequestTemplateDefinitionXmlGetOutXmlFile() {
    return (String)outputMap.get("BatchRequestTemplateDefinitionXmlGetOutXmlFile");
  }
}
