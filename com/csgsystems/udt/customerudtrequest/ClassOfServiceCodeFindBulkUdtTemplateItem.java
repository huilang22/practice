/*
 * Generated code DO NOT EDIT
 * Generated file: ClassOfServiceCodeFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ClassOfServiceCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ClassOfServiceCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected COSCObjectFilter COSCFindIn;
/**
 *
 * Constructor to create a  ClassOfServiceCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClassOfServiceCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectFilter COSCFindInIn) {
    super(id, context, "ClassOfServiceCodeFind");
    COSCFindIn = COSCFindInIn;
  }

  public void translateToMap() {
    if (COSCFindIn != null) {
      Integer index =  COSCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(COSCFindIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }


/**
 *
 * Sets the ClassOfServiceCode
 * @param COSCFindInIn Value of the COSCFindIn
 *
 */

  public void setClassOfServiceCode(COSCObjectFilter COSCFindInIn) {
    COSCFindIn = COSCFindInIn;
  }

  public void translateFromMap() {
    COSCFindIn = COSCObjectHelper.fromMapFilter(inputMap, "ClassOfServiceCode");
  }

/**
 *
 * Gets the ClassOfServiceCode
 * @return Value of the ClassOfServiceCode
 *
 */

  public COSCObjectFilter getClassOfServiceCode( ) {
    return COSCFindIn;
  }

}
