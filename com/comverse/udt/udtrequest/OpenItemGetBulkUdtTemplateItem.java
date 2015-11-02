/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemGetBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemObjectKeyData OIIGetIn;
/**
 *
 * Constructor to create a  OpenItemGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectKeyData OIIGetInIn) {
    super(id, context, "OpenItemGet");
    OIIGetIn = OIIGetInIn;
  }

  public void translateToMap() {
    if (OIIGetIn != null) {
      OIIGetIn.resetFlags(true, true);
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(OIIGetIn, new HashMap(), "OpenItemObjectKeyData").get("OpenItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the OpenItem
 * @param OIIGetInIn Value of the OIIGetIn
 *
 */

  public void setOpenItem(OpenItemObjectKeyData OIIGetInIn) {
    OIIGetIn = OIIGetInIn;
  }

  public void translateFromMap() {
    OIIGetIn = OpenItemObjectKeyHelper.fromMap(inputMap, "OpenItem");
  }

/**
 *
 * Gets the OpenItem
 * @return Value of the OpenItem
 *
 */

  public OpenItemObjectKeyData getOpenItem( ) {
    return OIIGetIn;
  }

}
