/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionXmlCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionXmlCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionXmlCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlCreateIn;
  protected String batchRequestTemplateDefinitionXmlCreateInXmlFile;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionXmlCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionXmlCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlCreateInIn, String batchRequestTemplateDefinitionXmlCreateInXmlFileIn) {
    super(id, context, "BatchRequestTemplateDefinitionXmlCreate");
    batchRequestTemplateDefinitionXmlCreateIn = batchRequestTemplateDefinitionXmlCreateInIn;
    batchRequestTemplateDefinitionXmlCreateInXmlFile = batchRequestTemplateDefinitionXmlCreateInXmlFileIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionXmlCreateIn != null) {
      batchRequestTemplateDefinitionXmlCreateIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionXmlCreateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionXmlCreateInXmlFile != null) {
      addInput("BatchRequestTemplateDefinitionXmlCreateInXmlFile", batchRequestTemplateDefinitionXmlCreateInXmlFile);
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionXmlCreateInIn Value of the batchRequestTemplateDefinitionXmlCreateIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlCreateInIn) {
    batchRequestTemplateDefinitionXmlCreateIn = batchRequestTemplateDefinitionXmlCreateInIn;
  }

/**
 *
 * Sets the BatchRequestTemplateDefinitionXmlCreateInXmlFile
 * @param batchRequestTemplateDefinitionXmlCreateInXmlFileIn Value of the batchRequestTemplateDefinitionXmlCreateInXmlFile
 *
 */

  public void setBatchRequestTemplateDefinitionXmlCreateInXmlFile(String batchRequestTemplateDefinitionXmlCreateInXmlFileIn) {
    batchRequestTemplateDefinitionXmlCreateInXmlFile = batchRequestTemplateDefinitionXmlCreateInXmlFileIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionXmlCreateIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
    batchRequestTemplateDefinitionXmlCreateInXmlFile = (String)inputMap.get("BatchRequestTemplateDefinitionXmlCreateInXmlFile");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionXmlCreateIn;
  }

/**
 *
 * Gets the BatchRequestTemplateDefinitionXmlCreateInXmlFile
 * @return Value of the BatchRequestTemplateDefinitionXmlCreateInXmlFile
 *
 */

  public String getBatchRequestTemplateDefinitionXmlCreateInXmlFile( ) {
    return batchRequestTemplateDefinitionXmlCreateInXmlFile;
  }

}
