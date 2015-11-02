/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintTypeObjectFilter bsdRelationalConstraintTypeFindIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectFilter bsdRelationalConstraintTypeFindInIn) {
    super(id, context, "BsdRelationalConstraintTypeFind");
    bsdRelationalConstraintTypeFindIn = bsdRelationalConstraintTypeFindInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintTypeFindIn != null) {
      Integer index =  bsdRelationalConstraintTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(bsdRelationalConstraintTypeFindIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintType
 * @param bsdRelationalConstraintTypeFindInIn Value of the bsdRelationalConstraintTypeFindIn
 *
 */

  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectFilter bsdRelationalConstraintTypeFindInIn) {
    bsdRelationalConstraintTypeFindIn = bsdRelationalConstraintTypeFindInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintTypeFindIn = BsdRelationalConstraintTypeObjectHelper.fromMapFilter(inputMap, "BsdRelationalConstraintType");
  }

/**
 *
 * Gets the BsdRelationalConstraintType
 * @return Value of the BsdRelationalConstraintType
 *
 */

  public BsdRelationalConstraintTypeObjectFilter getBsdRelationalConstraintType( ) {
    return bsdRelationalConstraintTypeFindIn;
  }

}
