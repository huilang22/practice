/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapCancelBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectData OIIMCancelIn;
/**
 *
 * Constructor to create a  OpenItemIdMapCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData OIIMCancelInIn) {
    super(id, context, "OpenItemIdMapCancel");
    OIIMCancelIn = OIIMCancelInIn;
  }

  public void translateToMap() {
    if (OIIMCancelIn != null) {
      OIIMCancelIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMCancelIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMCancelInIn Value of the OIIMCancelIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectData OIIMCancelInIn) {
    OIIMCancelIn = OIIMCancelInIn;
  }

  public void translateFromMap() {
    OIIMCancelIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectData getOpenItemIdMap( ) {
    return OIIMCancelIn;
  }

}
