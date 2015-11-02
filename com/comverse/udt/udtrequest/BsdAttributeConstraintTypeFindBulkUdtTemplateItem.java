/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintTypeObjectFilter bsdAttributeConstraintTypeFindIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectFilter bsdAttributeConstraintTypeFindInIn) {
    super(id, context, "BsdAttributeConstraintTypeFind");
    bsdAttributeConstraintTypeFindIn = bsdAttributeConstraintTypeFindInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintTypeFindIn != null) {
      Integer index =  bsdAttributeConstraintTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(bsdAttributeConstraintTypeFindIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintType
 * @param bsdAttributeConstraintTypeFindInIn Value of the bsdAttributeConstraintTypeFindIn
 *
 */

  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectFilter bsdAttributeConstraintTypeFindInIn) {
    bsdAttributeConstraintTypeFindIn = bsdAttributeConstraintTypeFindInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintTypeFindIn = BsdAttributeConstraintTypeObjectHelper.fromMapFilter(inputMap, "BsdAttributeConstraintType");
  }

/**
 *
 * Gets the BsdAttributeConstraintType
 * @return Value of the BsdAttributeConstraintType
 *
 */

  public BsdAttributeConstraintTypeObjectFilter getBsdAttributeConstraintType( ) {
    return bsdAttributeConstraintTypeFindIn;
  }

}
