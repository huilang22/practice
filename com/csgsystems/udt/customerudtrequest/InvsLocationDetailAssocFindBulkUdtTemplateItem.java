/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsLocationDetailAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationTablesObjectFilter InvsLocationDetailAssocFindIn;
/**
 *
 * Constructor to create a  InvsLocationDetailAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationTablesObjectFilter InvsLocationDetailAssocFindInIn) {
    super(id, context, "InvsLocationDetailAssocFind");
    InvsLocationDetailAssocFindIn = InvsLocationDetailAssocFindInIn;
  }

  public void translateToMap() {
    if (InvsLocationDetailAssocFindIn != null) {
      Integer index =  InvsLocationDetailAssocFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectHelper.toMap(InvsLocationDetailAssocFindIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }


/**
 *
 * Sets the InvsLocationDetailAssoc
 * @param InvsLocationDetailAssocFindInIn Value of the InvsLocationDetailAssocFindIn
 *
 */

  public void setInvsLocationDetailAssoc(InvsLocationTablesObjectFilter InvsLocationDetailAssocFindInIn) {
    InvsLocationDetailAssocFindIn = InvsLocationDetailAssocFindInIn;
  }

  public void translateFromMap() {
    InvsLocationDetailAssocFindIn = InvsLocationTablesObjectHelper.fromMapFilter(inputMap, "InvsLocationDetailAssoc");
  }

/**
 *
 * Gets the InvsLocationDetailAssoc
 * @return Value of the InvsLocationDetailAssoc
 *
 */

  public InvsLocationTablesObjectFilter getInvsLocationDetailAssoc( ) {
    return InvsLocationDetailAssocFindIn;
  }

}
