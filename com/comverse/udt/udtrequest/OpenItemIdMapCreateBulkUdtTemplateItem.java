/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemIdMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectData OIIMCreateIn;
/**
 *
 * Constructor to create a  OpenItemIdMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData OIIMCreateInIn) {
    super(id, context, "OpenItemIdMapCreate");
    OIIMCreateIn = OIIMCreateInIn;
  }

  public void translateToMap() {
    if (OIIMCreateIn != null) {
      OIIMCreateIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(OIIMCreateIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMCreateInIn Value of the OIIMCreateIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectData OIIMCreateInIn) {
    OIIMCreateIn = OIIMCreateInIn;
  }

  public void translateFromMap() {
    OIIMCreateIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectData getOpenItemIdMap( ) {
    return OIIMCreateIn;
  }

}
