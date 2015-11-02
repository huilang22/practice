/*
 * Generated code DO NOT EDIT
 * Generated file: ServerCategoryGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServerCategoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServerCategoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SCObjectData noOpIn;

/**
 *
 * Constructor to create a   ServerCategoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServerCategoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SCObjectData noOpInIn) {
    super(id, context, "ServerCategoryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServerCategory", SCObjectHelper.toMap(noOpIn, new HashMap(), "ServerCategory").get("ServerCategory"));
    }
  }
/**
 *
 * Sets the  ServerCategory
 * @param noOpInIn SCObjectData to set
 *
 */
  public void setServerCategory(SCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServerCategory passed into the constructor
 * @return Simulated response
 *
 */
  public SCObjectData getServerCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SCObjectHelper.fromMap(inputMap, "ServerCategory");
  }
}
