/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ParentCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ParentCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ParentCodeObjectData ParentCodeUpdateIn;
/**
 *
 * Constructor to create a  ParentCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ParentCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectData ParentCodeUpdateInIn) {
    super(id, context, "ParentCodeUpdate");
    ParentCodeUpdateIn = ParentCodeUpdateInIn;
  }

  public void translateToMap() {
    if (ParentCodeUpdateIn != null) {
      ParentCodeUpdateIn.resetFlags(true, true);
      addInput("ParentCode", ParentCodeObjectHelper.toMap(ParentCodeUpdateIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }


/**
 *
 * Sets the ParentCode
 * @param ParentCodeUpdateInIn Value of the ParentCodeUpdateIn
 *
 */

  public void setParentCode(ParentCodeObjectData ParentCodeUpdateInIn) {
    ParentCodeUpdateIn = ParentCodeUpdateInIn;
  }

  public void translateFromMap() {
    ParentCodeUpdateIn = ParentCodeObjectHelper.fromMap(inputMap, "ParentCode");
  }

/**
 *
 * Gets the ParentCode
 * @return Value of the ParentCode
 *
 */

  public ParentCodeObjectData getParentCode( ) {
    return ParentCodeUpdateIn;
  }

}
