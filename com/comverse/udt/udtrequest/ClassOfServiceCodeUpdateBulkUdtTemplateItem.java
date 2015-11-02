/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ClassOfServiceCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ClassOfServiceCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected COSCObjectData COSCUpdateIn;
/**
 *
 * Constructor to create a  ClassOfServiceCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClassOfServiceCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectData COSCUpdateInIn) {
    super(id, context, "ClassOfServiceCodeUpdate");
    COSCUpdateIn = COSCUpdateInIn;
  }

  public void translateToMap() {
    if (COSCUpdateIn != null) {
      COSCUpdateIn.resetFlags(true, true);
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(COSCUpdateIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }


/**
 *
 * Sets the ClassOfServiceCode
 * @param COSCUpdateInIn Value of the COSCUpdateIn
 *
 */

  public void setClassOfServiceCode(COSCObjectData COSCUpdateInIn) {
    COSCUpdateIn = COSCUpdateInIn;
  }

  public void translateFromMap() {
    COSCUpdateIn = COSCObjectHelper.fromMap(inputMap, "ClassOfServiceCode");
  }

/**
 *
 * Gets the ClassOfServiceCode
 * @return Value of the ClassOfServiceCode
 *
 */

  public COSCObjectData getClassOfServiceCode( ) {
    return COSCUpdateIn;
  }

}
