/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalDefaultFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalDefaultFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalDefaultObjectFilter bsdRelationalDefaultFindIn;
/**
 *
 * Constructor to create a  BsdRelationalDefaultFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalDefaultFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectFilter bsdRelationalDefaultFindInIn) {
    super(id, context, "BsdRelationalDefaultFind");
    bsdRelationalDefaultFindIn = bsdRelationalDefaultFindInIn;
  }

  public void translateToMap() {
    if (bsdRelationalDefaultFindIn != null) {
      Integer index =  bsdRelationalDefaultFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectHelper.toMap(bsdRelationalDefaultFindIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }


/**
 *
 * Sets the BsdRelationalDefault
 * @param bsdRelationalDefaultFindInIn Value of the bsdRelationalDefaultFindIn
 *
 */

  public void setBsdRelationalDefault(BsdRelationalDefaultObjectFilter bsdRelationalDefaultFindInIn) {
    bsdRelationalDefaultFindIn = bsdRelationalDefaultFindInIn;
  }

  public void translateFromMap() {
    bsdRelationalDefaultFindIn = BsdRelationalDefaultObjectHelper.fromMapFilter(inputMap, "BsdRelationalDefault");
  }

/**
 *
 * Gets the BsdRelationalDefault
 * @return Value of the BsdRelationalDefault
 *
 */

  public BsdRelationalDefaultObjectFilter getBsdRelationalDefault( ) {
    return bsdRelationalDefaultFindIn;
  }

}
