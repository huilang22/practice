/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemFindBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemObjectFilter OIIFindIn;
/**
 *
 * Constructor to create a  OpenItemFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemObjectFilter OIIFindInIn) {
    super(id, context, "OpenItemFind");
    OIIFindIn = OIIFindInIn;
  }

  public void translateToMap() {
    if (OIIFindIn != null) {
      Integer index =  OIIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OpenItem", OpenItemObjectHelper.toMap(OIIFindIn, new HashMap(), "OpenItem").get("OpenItem"));
    }
  }


/**
 *
 * Sets the OpenItem
 * @param OIIFindInIn Value of the OIIFindIn
 *
 */

  public void setOpenItem(OpenItemObjectFilter OIIFindInIn) {
    OIIFindIn = OIIFindInIn;
  }

  public void translateFromMap() {
    OIIFindIn = OpenItemObjectHelper.fromMapFilter(inputMap, "OpenItem");
  }

/**
 *
 * Gets the OpenItem
 * @return Value of the OpenItem
 *
 */

  public OpenItemObjectFilter getOpenItem( ) {
    return OIIFindIn;
  }

}
