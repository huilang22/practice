/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementSwapBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvElementSwapBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementSwapBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Date SwapStartDate;
  protected String ViewIdSwapOut;
  protected String ViewIdSwapIn;
  protected Integer SwapParamA;
  protected Integer SwapParamB;
  protected Integer SwapDiscReason;
/**
 *
 * Constructor to create a  InvElementSwapBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementSwapBulkUdtTemplateItem(String id, BSDMSessionContext context, Date SwapStartDateIn, String ViewIdSwapOutIn, String ViewIdSwapInIn, Integer SwapParamAIn, Integer SwapParamBIn, Integer SwapDiscReasonIn) {
    super(id, context, "InvElementSwap");
    SwapStartDate = SwapStartDateIn;
    ViewIdSwapOut = ViewIdSwapOutIn;
    ViewIdSwapIn = ViewIdSwapInIn;
    SwapParamA = SwapParamAIn;
    SwapParamB = SwapParamBIn;
    SwapDiscReason = SwapDiscReasonIn;
  }

  public void translateToMap() {
    if (SwapStartDate != null) {
      addInput("SwapStartDate", SwapStartDate);
    }
    if (ViewIdSwapOut != null) {
      addInput("ViewIdSwapOut", ViewIdSwapOut);
    }
    if (ViewIdSwapIn != null) {
      addInput("ViewIdSwapIn", ViewIdSwapIn);
    }
    if (SwapParamA != null) {
      addInput("SwapParamA", SwapParamA);
    }
    if (SwapParamB != null) {
      addInput("SwapParamB", SwapParamB);
    }
    if (SwapDiscReason != null) {
      addInput("SwapDiscReason", SwapDiscReason);
    }
  }


/**
 *
 * Sets the SwapStartDate
 * @param SwapStartDateIn Value of the SwapStartDate
 *
 */

  public void setSwapStartDate(Date SwapStartDateIn) {
    SwapStartDate = SwapStartDateIn;
  }

/**
 *
 * Sets the ViewIdSwapOut
 * @param ViewIdSwapOutIn Value of the ViewIdSwapOut
 *
 */

  public void setViewIdSwapOut(String ViewIdSwapOutIn) {
    ViewIdSwapOut = ViewIdSwapOutIn;
  }

/**
 *
 * Sets the ViewIdSwapIn
 * @param ViewIdSwapInIn Value of the ViewIdSwapIn
 *
 */

  public void setViewIdSwapIn(String ViewIdSwapInIn) {
    ViewIdSwapIn = ViewIdSwapInIn;
  }

/**
 *
 * Sets the SwapParamA
 * @param SwapParamAIn Value of the SwapParamA
 *
 */

  public void setSwapParamA(Integer SwapParamAIn) {
    SwapParamA = SwapParamAIn;
  }

/**
 *
 * Sets the SwapParamB
 * @param SwapParamBIn Value of the SwapParamB
 *
 */

  public void setSwapParamB(Integer SwapParamBIn) {
    SwapParamB = SwapParamBIn;
  }

/**
 *
 * Sets the SwapDiscReason
 * @param SwapDiscReasonIn Value of the SwapDiscReason
 *
 */

  public void setSwapDiscReason(Integer SwapDiscReasonIn) {
    SwapDiscReason = SwapDiscReasonIn;
  }

  public void translateFromMap() {
    SwapStartDate = (Date)inputMap.get("SwapStartDate");
    ViewIdSwapOut = (String)inputMap.get("ViewIdSwapOut");
    ViewIdSwapIn = (String)inputMap.get("ViewIdSwapIn");
    SwapParamA = (Integer)inputMap.get("SwapParamA");
    SwapParamB = (Integer)inputMap.get("SwapParamB");
    SwapDiscReason = (Integer)inputMap.get("SwapDiscReason");
  }

/**
 *
 * Gets the SwapStartDate
 * @return Value of the SwapStartDate
 *
 */

  public Date getSwapStartDate( ) {
    return SwapStartDate;
  }

/**
 *
 * Gets the ViewIdSwapOut
 * @return Value of the ViewIdSwapOut
 *
 */

  public String getViewIdSwapOut( ) {
    return ViewIdSwapOut;
  }

/**
 *
 * Gets the ViewIdSwapIn
 * @return Value of the ViewIdSwapIn
 *
 */

  public String getViewIdSwapIn( ) {
    return ViewIdSwapIn;
  }

/**
 *
 * Gets the SwapParamA
 * @return Value of the SwapParamA
 *
 */

  public Integer getSwapParamA( ) {
    return SwapParamA;
  }

/**
 *
 * Gets the SwapParamB
 * @return Value of the SwapParamB
 *
 */

  public Integer getSwapParamB( ) {
    return SwapParamB;
  }

/**
 *
 * Gets the SwapDiscReason
 * @return Value of the SwapDiscReason
 *
 */

  public Integer getSwapDiscReason( ) {
    return SwapDiscReason;
  }

}
