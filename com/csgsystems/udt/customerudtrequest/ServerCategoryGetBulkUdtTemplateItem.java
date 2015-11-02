/*
 * Generated code DO NOT EDIT
 * Generated file: ServerCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a ServerCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SCObjectKeyData SCGetIn;
/**
 *
 * Constructor to create a  ServerCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SCObjectKeyData SCGetInIn) {
    super(id, context, "ServerCategoryGet");
    SCGetIn = SCGetInIn;
  }

  public void translateToMap() {
    if (SCGetIn != null) {
      SCGetIn.resetFlags(true, true);
      addInput("ServerCategory", SCObjectKeyHelper.toMap(SCGetIn, new HashMap(), "SCObjectKeyData").get("SCObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServerCategory
 * @param SCGetInIn Value of the SCGetIn
 *
 */

  public void setServerCategory(SCObjectKeyData SCGetInIn) {
    SCGetIn = SCGetInIn;
  }

  public void translateFromMap() {
    SCGetIn = SCObjectKeyHelper.fromMap(inputMap, "ServerCategory");
  }

/**
 *
 * Gets the ServerCategory
 * @return Value of the ServerCategory
 *
 */

  public SCObjectKeyData getServerCategory( ) {
    return SCGetIn;
  }

}
