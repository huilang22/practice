/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupsObjectFilter hgfIn;
/**
 *
 * Constructor to create a  HqGroupsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectFilter hgfInIn) {
    super(id, context, "HqGroupsFind");
    hgfIn = hgfInIn;
  }

  public void translateToMap() {
    if (hgfIn != null) {
      Integer index =  hgfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hgfIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }


/**
 *
 * Sets the HqGroups
 * @param hgfInIn Value of the hgfIn
 *
 */

  public void setHqGroups(HqGroupsObjectFilter hgfInIn) {
    hgfIn = hgfInIn;
  }

  public void translateFromMap() {
    hgfIn = HqGroupsObjectHelper.fromMapFilter(inputMap, "HqGroups");
  }

/**
 *
 * Gets the HqGroups
 * @return Value of the HqGroups
 *
 */

  public HqGroupsObjectFilter getHqGroups( ) {
    return hgfIn;
  }

}
