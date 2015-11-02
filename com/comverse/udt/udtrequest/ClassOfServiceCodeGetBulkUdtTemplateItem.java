/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ClassOfServiceCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ClassOfServiceCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected COSCObjectKeyData COSCGetIn;
/**
 *
 * Constructor to create a  ClassOfServiceCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClassOfServiceCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectKeyData COSCGetInIn) {
    super(id, context, "ClassOfServiceCodeGet");
    COSCGetIn = COSCGetInIn;
  }

  public void translateToMap() {
    if (COSCGetIn != null) {
      COSCGetIn.resetFlags(true, true);
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(COSCGetIn, new HashMap(), "COSCObjectKeyData").get("COSCObjectKeyData"));
    }
  }


/**
 *
 * Sets the ClassOfServiceCode
 * @param COSCGetInIn Value of the COSCGetIn
 *
 */

  public void setClassOfServiceCode(COSCObjectKeyData COSCGetInIn) {
    COSCGetIn = COSCGetInIn;
  }

  public void translateFromMap() {
    COSCGetIn = COSCObjectKeyHelper.fromMap(inputMap, "ClassOfServiceCode");
  }

/**
 *
 * Gets the ClassOfServiceCode
 * @return Value of the ClassOfServiceCode
 *
 */

  public COSCObjectKeyData getClassOfServiceCode( ) {
    return COSCGetIn;
  }

}
