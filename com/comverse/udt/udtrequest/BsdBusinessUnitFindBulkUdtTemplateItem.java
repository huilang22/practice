/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdBusinessUnitFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdBusinessUnitFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdBusinessUnitObjectFilter bsdBusinessUnitFindIn;
/**
 *
 * Constructor to create a  BsdBusinessUnitFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdBusinessUnitFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectFilter bsdBusinessUnitFindInIn) {
    super(id, context, "BsdBusinessUnitFind");
    bsdBusinessUnitFindIn = bsdBusinessUnitFindInIn;
  }

  public void translateToMap() {
    if (bsdBusinessUnitFindIn != null) {
      Integer index =  bsdBusinessUnitFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(bsdBusinessUnitFindIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }


/**
 *
 * Sets the BsdBusinessUnit
 * @param bsdBusinessUnitFindInIn Value of the bsdBusinessUnitFindIn
 *
 */

  public void setBsdBusinessUnit(BsdBusinessUnitObjectFilter bsdBusinessUnitFindInIn) {
    bsdBusinessUnitFindIn = bsdBusinessUnitFindInIn;
  }

  public void translateFromMap() {
    bsdBusinessUnitFindIn = BsdBusinessUnitObjectHelper.fromMapFilter(inputMap, "BsdBusinessUnit");
  }

/**
 *
 * Gets the BsdBusinessUnit
 * @return Value of the BsdBusinessUnit
 *
 */

  public BsdBusinessUnitObjectFilter getBsdBusinessUnit( ) {
    return bsdBusinessUnitFindIn;
  }

}
