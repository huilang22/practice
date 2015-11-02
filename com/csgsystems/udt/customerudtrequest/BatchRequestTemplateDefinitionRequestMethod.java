/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestTemplateDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestTemplateDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestTemplateDefinitionCreate method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_CREATE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionCreate");
  /** Variable representing the BatchRequestTemplateDefinitionDelete method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_DELETE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionDelete");
  /** Variable representing the BatchRequestTemplateDefinitionFind method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_FIND = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionFind");
  /** Variable representing the BatchRequestTemplateDefinitionGet method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_GET = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionGet");
  /** Variable representing the BatchRequestTemplateDefinitionRetrieve method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_RETRIEVE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionRetrieve");
  /** Variable representing the BatchRequestTemplateDefinitionSequenceGet method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_SEQUENCE_GET = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionSequenceGet");
  /** Variable representing the BatchRequestTemplateDefinitionUdtCreate method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_UDT_CREATE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionUdtCreate");
  /** Variable representing the BatchRequestTemplateDefinitionUdtGet method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_UDT_GET = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionUdtGet");
  /** Variable representing the BatchRequestTemplateDefinitionUdtUpdate method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_UDT_UPDATE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionUdtUpdate");
  /** Variable representing the BatchRequestTemplateDefinitionUpdate method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_UPDATE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionUpdate");
  /** Variable representing the BatchRequestTemplateDefinitionXmlCreate method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_XML_CREATE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionXmlCreate");
  /** Variable representing the BatchRequestTemplateDefinitionXmlGet method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_XML_GET = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionXmlGet");
  /** Variable representing the BatchRequestTemplateDefinitionXmlUpdate method */
  public static final BatchRequestTemplateDefinitionRequestMethod BATCH_REQUEST_TEMPLATE_DEFINITION_XML_UPDATE = new BatchRequestTemplateDefinitionRequestMethod("BatchRequestTemplateDefinitionXmlUpdate");
}
