/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionGetBulkUdtTemplateItem.java
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
 * Class used to create a NetActionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NetActionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NetActionObjectKeyData NARGetIn;
/**
 *
 * Constructor to create a  NetActionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NetActionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NetActionObjectKeyData NARGetInIn) {
    super(id, context, "NetActionGet");
    NARGetIn = NARGetInIn;
  }

  public void translateToMap() {
    if (NARGetIn != null) {
      NARGetIn.resetFlags(true, true);
      addInput("NetAction", NetActionObjectKeyHelper.toMap(NARGetIn, new HashMap(), "NetActionObjectKeyData").get("NetActionObjectKeyData"));
    }
  }


/**
 *
 * Sets the NetAction
 * @param NARGetInIn Value of the NARGetIn
 *
 */

  public void setNetAction(NetActionObjectKeyData NARGetInIn) {
    NARGetIn = NARGetInIn;
  }

  public void translateFromMap() {
    NARGetIn = NetActionObjectKeyHelper.fromMap(inputMap, "NetAction");
  }

/**
 *
 * Gets the NetAction
 * @return Value of the NetAction
 *
 */

  public NetActionObjectKeyData getNetAction( ) {
    return NARGetIn;
  }

}
