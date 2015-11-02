/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemObjectData OIIUpdateIn;
/**
 *
 * Constructor to create a  OpenItemUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectData OIIUpdateInIn) {
    super(id, context, "OpenItemUpdate");
    OIIUpdateIn = OIIUpdateInIn;
  }

  public void translateToMap() {
    if (OIIUpdateIn != null) {
      OIIUpdateIn.resetFlags(true, true);
      addInput("OpenItem", OpenItemObjectHelper.toMap(OIIUpdateIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }


/**
 *
 * Sets the OpenItem
 * @param OIIUpdateInIn Value of the OIIUpdateIn
 *
 */

  public void setOpenItem(OpenItemObjectData OIIUpdateInIn) {
    OIIUpdateIn = OIIUpdateInIn;
  }

  public void translateFromMap() {
    OIIUpdateIn = OpenItemObjectHelper.fromMap(inputMap, "OpenItem");
  }

/**
 *
 * Gets the OpenItem
 * @return Value of the OpenItem
 *
 */

  public OpenItemObjectData getOpenItem( ) {
    return OIIUpdateIn;
  }

}
