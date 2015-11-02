/*
 * Generated code DO NOT EDIT
 * Generated file: ServerCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a ServerCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SCObjectFilter SCFindIn;
/**
 *
 * Constructor to create a  ServerCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SCObjectFilter SCFindInIn) {
    super(id, context, "ServerCategoryFind");
    SCFindIn = SCFindInIn;
  }

  public void translateToMap() {
    if (SCFindIn != null) {
      Integer index =  SCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServerCategory", SCObjectHelper.toMap(SCFindIn, new HashMap(), "ServerCategory").get("ServerCategory"));
    }
  }


/**
 *
 * Sets the ServerCategory
 * @param SCFindInIn Value of the SCFindIn
 *
 */

  public void setServerCategory(SCObjectFilter SCFindInIn) {
    SCFindIn = SCFindInIn;
  }

  public void translateFromMap() {
    SCFindIn = SCObjectHelper.fromMapFilter(inputMap, "ServerCategory");
  }

/**
 *
 * Gets the ServerCategory
 * @return Value of the ServerCategory
 *
 */

  public SCObjectFilter getServerCategory( ) {
    return SCFindIn;
  }

}
