/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintDescriptionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintDescriptionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionDeleteIn;
/**
 *
 * Constructor to create a  BsdConstraintDescriptionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintDescriptionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionDeleteInIn) {
    super(id, context, "BsdConstraintDescriptionDelete");
    bsdConstraintDescriptionDeleteIn = bsdConstraintDescriptionDeleteInIn;
  }

  public void translateToMap() {
    if (bsdConstraintDescriptionDeleteIn != null) {
      bsdConstraintDescriptionDeleteIn.resetFlags(true, true);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(bsdConstraintDescriptionDeleteIn, new HashMap(), "BsdConstraintDescriptionObjectKeyData").get("BsdConstraintDescriptionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdConstraintDescription
 * @param bsdConstraintDescriptionDeleteInIn Value of the bsdConstraintDescriptionDeleteIn
 *
 */

  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionDeleteInIn) {
    bsdConstraintDescriptionDeleteIn = bsdConstraintDescriptionDeleteInIn;
  }

  public void translateFromMap() {
    bsdConstraintDescriptionDeleteIn = BsdConstraintDescriptionObjectKeyHelper.fromMap(inputMap, "BsdConstraintDescription");
  }

/**
 *
 * Gets the BsdConstraintDescription
 * @return Value of the BsdConstraintDescription
 *
 */

  public BsdConstraintDescriptionObjectKeyData getBsdConstraintDescription( ) {
    return bsdConstraintDescriptionDeleteIn;
  }

}
