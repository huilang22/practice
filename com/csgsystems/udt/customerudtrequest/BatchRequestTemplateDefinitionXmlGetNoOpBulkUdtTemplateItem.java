/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionXmlGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestTemplateDefinitionXmlGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestTemplateDefinitionXmlGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected String noOpIn;

/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionXmlGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionXmlGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, String noOpInIn) {
    super(id, context, "BatchRequestTemplateDefinitionXmlGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("BatchRequestTemplateDefinitionXmlGetOutXmlFile", noOpIn);
    }
  }
/**
 *
 * Sets the  BatchRequestTemplateDefinitionXmlGetOutXmlFile
 * @param noOpInIn String to set
 *
 */
  public void setBatchRequestTemplateDefinitionXmlGetOutXmlFile(String noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestTemplateDefinitionXmlGetOutXmlFile passed into the constructor
 * @return Simulated response
 *
 */
  public String getBatchRequestTemplateDefinitionXmlGetOutXmlFile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (String)inputMap.get("BatchRequestTemplateDefinitionXmlGetOutXmlFile");
  }
}
