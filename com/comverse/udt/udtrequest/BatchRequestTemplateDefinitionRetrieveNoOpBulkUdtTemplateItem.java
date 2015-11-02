/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionRetrieveNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionRetrieveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestTemplateDefinitionRetrieveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Object noOpIn;

/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionRetrieveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionRetrieveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Object noOpInIn) {
    super(id, context, "BatchRequestTemplateDefinitionRetrieve");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Template", noOpIn);
    }
  }
/**
 *
 * Sets the  Template
 * @param noOpInIn Object to set
 *
 */
  public void setTemplate(Object noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Template passed into the constructor
 * @return Simulated response
 *
 */
  public Object getTemplate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Object)inputMap.get("Template");
  }
}
