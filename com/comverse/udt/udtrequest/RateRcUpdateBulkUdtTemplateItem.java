/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateRcUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateRcUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RACObjectData RACUpdateIn;
  protected RACObjectFilter RACUpdateFilter;
  protected RACObjectData RACUpdateGet;
/**
 *
 * Constructor to create a  RateRcUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateRcUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectData RACUpdateInIn, RACObjectFilter RACUpdateFilterIn, RACObjectData RACUpdateGetIn) {
    super(id, context, "RateRcUpdate");
    RACUpdateIn = RACUpdateInIn;
    RACUpdateFilter = RACUpdateFilterIn;
    RACUpdateGet = RACUpdateGetIn;
  }

  public void translateToMap() {
    if (RACUpdateIn != null) {
      RACUpdateIn.resetFlags(true, true);
      addInput("RateRc", RACObjectHelper.toMap(RACUpdateIn, new HashMap(), "RateRc").get("RateRc"));
    }
    if (RACUpdateFilter != null) {
      Integer index =  RACUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RACUpdateFilter", RACObjectHelper.toMap(RACUpdateFilter, new HashMap(), "RateRc").get("RateRc"));
    }
    if (RACUpdateGet != null) {
      RACUpdateGet.resetFlags(true, true);
      addInput("RACUpdateGet", RACObjectHelper.toMap(RACUpdateGet, new HashMap(), "RateRc").get("RateRc"));
    }
  }


/**
 *
 * Sets the RateRc
 * @param RACUpdateInIn Value of the RACUpdateIn
 *
 */

  public void setRateRc(RACObjectData RACUpdateInIn) {
    RACUpdateIn = RACUpdateInIn;
  }

/**
 *
 * Sets the RACUpdateFilter
 * @param RACUpdateFilterIn Value of the RACUpdateFilter
 *
 */

  public void setRACUpdateFilter(RACObjectFilter RACUpdateFilterIn) {
    RACUpdateFilter = RACUpdateFilterIn;
  }

/**
 *
 * Sets the RACUpdateGet
 * @param RACUpdateGetIn Value of the RACUpdateGet
 *
 */

  public void setRACUpdateGet(RACObjectData RACUpdateGetIn) {
    RACUpdateGet = RACUpdateGetIn;
  }

  public void translateFromMap() {
    RACUpdateIn = RACObjectHelper.fromMap(inputMap, "RateRc");
    RACUpdateFilter = RACObjectHelper.fromMapFilter(inputMap, "RACUpdateFilter");
    RACUpdateGet = RACObjectHelper.fromMap(inputMap, "RACUpdateGet");
  }

/**
 *
 * Gets the RateRc
 * @return Value of the RateRc
 *
 */

  public RACObjectData getRateRc( ) {
    return RACUpdateIn;
  }

/**
 *
 * Gets the RACUpdateFilter
 * @return Value of the RACUpdateFilter
 *
 */

  public RACObjectFilter getRACUpdateFilter( ) {
    return RACUpdateFilter;
  }

/**
 *
 * Gets the RACUpdateGet
 * @return Value of the RACUpdateGet
 *
 */

  public RACObjectData getRACUpdateGet( ) {
    return RACUpdateGet;
  }

}
