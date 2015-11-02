/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BsdConstraintDescriptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintDescriptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintDescriptionObjectFilter bsdConstraintDescriptionFindIn;
/**
 *
 * Constructor to create a  BsdConstraintDescriptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintDescriptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectFilter bsdConstraintDescriptionFindInIn) {
    super(id, context, "BsdConstraintDescriptionFind");
    bsdConstraintDescriptionFindIn = bsdConstraintDescriptionFindInIn;
  }

  public void translateToMap() {
    if (bsdConstraintDescriptionFindIn != null) {
      Integer index =  bsdConstraintDescriptionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(bsdConstraintDescriptionFindIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }


/**
 *
 * Sets the BsdConstraintDescription
 * @param bsdConstraintDescriptionFindInIn Value of the bsdConstraintDescriptionFindIn
 *
 */

  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectFilter bsdConstraintDescriptionFindInIn) {
    bsdConstraintDescriptionFindIn = bsdConstraintDescriptionFindInIn;
  }

  public void translateFromMap() {
    bsdConstraintDescriptionFindIn = BsdConstraintDescriptionObjectHelper.fromMapFilter(inputMap, "BsdConstraintDescription");
  }

/**
 *
 * Gets the BsdConstraintDescription
 * @return Value of the BsdConstraintDescription
 *
 */

  public BsdConstraintDescriptionObjectFilter getBsdConstraintDescription( ) {
    return bsdConstraintDescriptionFindIn;
  }

}
