/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionXmlUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchRequestTemplateDefinitionXmlUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionXmlUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlUpdateIn;
  protected String batchRequestTemplateDefinitionXmlUpdateInXmlFile;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionXmlUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionXmlUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlUpdateInIn, String batchRequestTemplateDefinitionXmlUpdateInXmlFileIn) {
    super(id, context, "BatchRequestTemplateDefinitionXmlUpdate");
    batchRequestTemplateDefinitionXmlUpdateIn = batchRequestTemplateDefinitionXmlUpdateInIn;
    batchRequestTemplateDefinitionXmlUpdateInXmlFile = batchRequestTemplateDefinitionXmlUpdateInXmlFileIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionXmlUpdateIn != null) {
      batchRequestTemplateDefinitionXmlUpdateIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionXmlUpdateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionXmlUpdateInXmlFile != null) {
      addInput("BatchRequestTemplateDefinitionXmlUpdateInXmlFile", batchRequestTemplateDefinitionXmlUpdateInXmlFile);
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionXmlUpdateInIn Value of the batchRequestTemplateDefinitionXmlUpdateIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlUpdateInIn) {
    batchRequestTemplateDefinitionXmlUpdateIn = batchRequestTemplateDefinitionXmlUpdateInIn;
  }

/**
 *
 * Sets the BatchRequestTemplateDefinitionXmlUpdateInXmlFile
 * @param batchRequestTemplateDefinitionXmlUpdateInXmlFileIn Value of the batchRequestTemplateDefinitionXmlUpdateInXmlFile
 *
 */

  public void setBatchRequestTemplateDefinitionXmlUpdateInXmlFile(String batchRequestTemplateDefinitionXmlUpdateInXmlFileIn) {
    batchRequestTemplateDefinitionXmlUpdateInXmlFile = batchRequestTemplateDefinitionXmlUpdateInXmlFileIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionXmlUpdateIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
    batchRequestTemplateDefinitionXmlUpdateInXmlFile = (String)inputMap.get("BatchRequestTemplateDefinitionXmlUpdateInXmlFile");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionXmlUpdateIn;
  }

/**
 *
 * Gets the BatchRequestTemplateDefinitionXmlUpdateInXmlFile
 * @return Value of the BatchRequestTemplateDefinitionXmlUpdateInXmlFile
 *
 */

  public String getBatchRequestTemplateDefinitionXmlUpdateInXmlFile( ) {
    return batchRequestTemplateDefinitionXmlUpdateInXmlFile;
  }

}
