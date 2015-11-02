/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionFindBulkUdtTemplateItem.java
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
 * Class used to create a NetActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NetActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NetActionObjectFilter NARFindIn;
/**
 *
 * Constructor to create a  NetActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NetActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NetActionObjectFilter NARFindInIn) {
    super(id, context, "NetActionFind");
    NARFindIn = NARFindInIn;
  }

  public void translateToMap() {
    if (NARFindIn != null) {
      Integer index =  NARFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NetAction", NetActionObjectHelper.toMap(NARFindIn, new HashMap(), "NetAction").get("NetAction"));
    }
  }


/**
 *
 * Sets the NetAction
 * @param NARFindInIn Value of the NARFindIn
 *
 */

  public void setNetAction(NetActionObjectFilter NARFindInIn) {
    NARFindIn = NARFindInIn;
  }

  public void translateFromMap() {
    NARFindIn = NetActionObjectHelper.fromMapFilter(inputMap, "NetAction");
  }

/**
 *
 * Gets the NetAction
 * @return Value of the NetAction
 *
 */

  public NetActionObjectFilter getNetAction( ) {
    return NARFindIn;
  }

}
