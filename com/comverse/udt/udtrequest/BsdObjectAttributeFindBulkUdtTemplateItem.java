/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdObjectAttributeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectAttributeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectAttributeObjectFilter bsdObjectAttributeFindIn;
/**
 *
 * Constructor to create a  BsdObjectAttributeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectAttributeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectFilter bsdObjectAttributeFindInIn) {
    super(id, context, "BsdObjectAttributeFind");
    bsdObjectAttributeFindIn = bsdObjectAttributeFindInIn;
  }

  public void translateToMap() {
    if (bsdObjectAttributeFindIn != null) {
      Integer index =  bsdObjectAttributeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectHelper.toMap(bsdObjectAttributeFindIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }


/**
 *
 * Sets the BsdObjectAttribute
 * @param bsdObjectAttributeFindInIn Value of the bsdObjectAttributeFindIn
 *
 */

  public void setBsdObjectAttribute(BsdObjectAttributeObjectFilter bsdObjectAttributeFindInIn) {
    bsdObjectAttributeFindIn = bsdObjectAttributeFindInIn;
  }

  public void translateFromMap() {
    bsdObjectAttributeFindIn = BsdObjectAttributeObjectHelper.fromMapFilter(inputMap, "BsdObjectAttribute");
  }

/**
 *
 * Gets the BsdObjectAttribute
 * @return Value of the BsdObjectAttribute
 *
 */

  public BsdObjectAttributeObjectFilter getBsdObjectAttribute( ) {
    return bsdObjectAttributeFindIn;
  }

}
