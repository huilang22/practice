/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemCreateBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemObjectData OIICreateIn;
/**
 *
 * Constructor to create a  OpenItemCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectData OIICreateInIn) {
    super(id, context, "OpenItemCreate");
    OIICreateIn = OIICreateInIn;
  }

  public void translateToMap() {
    if (OIICreateIn != null) {
      OIICreateIn.resetFlags(true, true);
      addInput("OpenItem", OpenItemObjectHelper.toMap(OIICreateIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }


/**
 *
 * Sets the OpenItem
 * @param OIICreateInIn Value of the OIICreateIn
 *
 */

  public void setOpenItem(OpenItemObjectData OIICreateInIn) {
    OIICreateIn = OIICreateInIn;
  }

  public void translateFromMap() {
    OIICreateIn = OpenItemObjectHelper.fromMap(inputMap, "OpenItem");
  }

/**
 *
 * Gets the OpenItem
 * @return Value of the OpenItem
 *
 */

  public OpenItemObjectData getOpenItem( ) {
    return OIICreateIn;
  }

}
