/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionCheckBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDefinitionCheckBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDefinitionCheckBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Date BDDcheck_In;
/**
 *
 * Constructor to create a  BusinessDayDefinitionCheckBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDefinitionCheckBulkUdtTemplateItem(String id, BSDMSessionContext context, Date BDDcheck_InIn) {
    super(id, context, "BusinessDayDefinitionCheck");
    BDDcheck_In = BDDcheck_InIn;
  }

  public void translateToMap() {
    if (BDDcheck_In != null) {
      addInput("BDDcheckIn", BDDcheck_In);
    }
  }


/**
 *
 * Sets the BDDcheckIn
 * @param BDDcheck_InIn Value of the BDDcheck_In
 *
 */

  public void setBDDcheckIn(Date BDDcheck_InIn) {
    BDDcheck_In = BDDcheck_InIn;
  }

  public void translateFromMap() {
    BDDcheck_In = (Date)inputMap.get("BDDcheckIn");
  }

/**
 *
 * Gets the BDDcheckIn
 * @return Value of the BDDcheckIn
 *
 */

  public Date getBDDcheckIn( ) {
    return BDDcheck_In;
  }

}
