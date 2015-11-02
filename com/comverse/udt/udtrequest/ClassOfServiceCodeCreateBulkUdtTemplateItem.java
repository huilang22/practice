/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a ClassOfServiceCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ClassOfServiceCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected COSCObjectData COSCCreateIn;
/**
 *
 * Constructor to create a  ClassOfServiceCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClassOfServiceCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectData COSCCreateInIn) {
    super(id, context, "ClassOfServiceCodeCreate");
    COSCCreateIn = COSCCreateInIn;
  }

  public void translateToMap() {
    if (COSCCreateIn != null) {
      COSCCreateIn.resetFlags(true, true);
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(COSCCreateIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }


/**
 *
 * Sets the ClassOfServiceCode
 * @param COSCCreateInIn Value of the COSCCreateIn
 *
 */

  public void setClassOfServiceCode(COSCObjectData COSCCreateInIn) {
    COSCCreateIn = COSCCreateInIn;
  }

  public void translateFromMap() {
    COSCCreateIn = COSCObjectHelper.fromMap(inputMap, "ClassOfServiceCode");
  }

/**
 *
 * Gets the ClassOfServiceCode
 * @return Value of the ClassOfServiceCode
 *
 */

  public COSCObjectData getClassOfServiceCode( ) {
    return COSCCreateIn;
  }

}
