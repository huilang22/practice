/*
 * Generated code DO NOT EDIT
 * Generated file: ClassOfServiceCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ClassOfServiceCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ClassOfServiceCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected COSCObjectKeyData COSCDeleteIn;
/**
 *
 * Constructor to create a  ClassOfServiceCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClassOfServiceCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectKeyData COSCDeleteInIn) {
    super(id, context, "ClassOfServiceCodeDelete");
    COSCDeleteIn = COSCDeleteInIn;
  }

  public void translateToMap() {
    if (COSCDeleteIn != null) {
      COSCDeleteIn.resetFlags(true, true);
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(COSCDeleteIn, new HashMap(), "COSCObjectKeyData").get("COSCObjectKeyData"));
    }
  }


/**
 *
 * Sets the ClassOfServiceCode
 * @param COSCDeleteInIn Value of the COSCDeleteIn
 *
 */

  public void setClassOfServiceCode(COSCObjectKeyData COSCDeleteInIn) {
    COSCDeleteIn = COSCDeleteInIn;
  }

  public void translateFromMap() {
    COSCDeleteIn = COSCObjectKeyHelper.fromMap(inputMap, "ClassOfServiceCode");
  }

/**
 *
 * Gets the ClassOfServiceCode
 * @return Value of the ClassOfServiceCode
 *
 */

  public COSCObjectKeyData getClassOfServiceCode( ) {
    return COSCDeleteIn;
  }

}
