/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesCreateBulkUdtTemplateItem.java
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
 * Class used to create a CcViewAttributesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CcViewAttributesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcViewAttributesObjectData CVAcreate_In;
/**
 *
 * Constructor to create a  CcViewAttributesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcViewAttributesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewAttributesObjectData CVAcreate_InIn) {
    super(id, context, "CcViewAttributesCreate");
    CVAcreate_In = CVAcreate_InIn;
  }

  public void translateToMap() {
    if (CVAcreate_In != null) {
      CVAcreate_In.resetFlags(true, true);
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(CVAcreate_In, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }


/**
 *
 * Sets the CcViewAttributes
 * @param CVAcreate_InIn Value of the CVAcreate_In
 *
 */

  public void setCcViewAttributes(CcViewAttributesObjectData CVAcreate_InIn) {
    CVAcreate_In = CVAcreate_InIn;
  }

  public void translateFromMap() {
    CVAcreate_In = CcViewAttributesObjectHelper.fromMap(inputMap, "CcViewAttributes");
  }

/**
 *
 * Gets the CcViewAttributes
 * @return Value of the CcViewAttributes
 *
 */

  public CcViewAttributesObjectData getCcViewAttributes( ) {
    return CVAcreate_In;
  }

}
