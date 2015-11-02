/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemDeleteBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemObjectKeyData OIIDeleteIn;
/**
 *
 * Constructor to create a  OpenItemDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectKeyData OIIDeleteInIn) {
    super(id, context, "OpenItemDelete");
    OIIDeleteIn = OIIDeleteInIn;
  }

  public void translateToMap() {
    if (OIIDeleteIn != null) {
      OIIDeleteIn.resetFlags(true, true);
      addInput("OpenItem", OpenItemObjectKeyHelper.toMap(OIIDeleteIn, new HashMap(), "OpenItemObjectKeyData").get("OpenItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the OpenItem
 * @param OIIDeleteInIn Value of the OIIDeleteIn
 *
 */

  public void setOpenItem(OpenItemObjectKeyData OIIDeleteInIn) {
    OIIDeleteIn = OIIDeleteInIn;
  }

  public void translateFromMap() {
    OIIDeleteIn = OpenItemObjectKeyHelper.fromMap(inputMap, "OpenItem");
  }

/**
 *
 * Gets the OpenItem
 * @return Value of the OpenItem
 *
 */

  public OpenItemObjectKeyData getOpenItem( ) {
    return OIIDeleteIn;
  }

}
