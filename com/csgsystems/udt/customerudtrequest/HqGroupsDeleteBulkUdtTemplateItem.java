/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupsObjectData hgxIn;
/**
 *
 * Constructor to create a  HqGroupsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData hgxInIn) {
    super(id, context, "HqGroupsDelete");
    hgxIn = hgxInIn;
  }

  public void translateToMap() {
    if (hgxIn != null) {
      hgxIn.resetFlags(true, true);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hgxIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }


/**
 *
 * Sets the HqGroups
 * @param hgxInIn Value of the hgxIn
 *
 */

  public void setHqGroups(HqGroupsObjectData hgxInIn) {
    hgxIn = hgxInIn;
  }

  public void translateFromMap() {
    hgxIn = HqGroupsObjectHelper.fromMap(inputMap, "HqGroups");
  }

/**
 *
 * Gets the HqGroups
 * @return Value of the HqGroups
 *
 */

  public HqGroupsObjectData getHqGroups( ) {
    return hgxIn;
  }

}
