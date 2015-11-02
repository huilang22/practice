/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDisconnectChargeAmountGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ComponentDisconnectChargeAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDisconnectChargeAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer comp_inst_id;
  protected Integer comp_inst_id_serv;
  protected Date disconnect_date;
/**
 *
 * Constructor to create a  ComponentDisconnectChargeAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDisconnectChargeAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer comp_inst_idIn, Integer comp_inst_id_servIn, Date disconnect_dateIn) {
    super(id, context, "ComponentDisconnectChargeAmountGet");
    comp_inst_id = comp_inst_idIn;
    comp_inst_id_serv = comp_inst_id_servIn;
    disconnect_date = disconnect_dateIn;
  }

  public void translateToMap() {
    if (comp_inst_id != null) {
      addInput("CompInstId", comp_inst_id);
    }
    if (comp_inst_id_serv != null) {
      addInput("CompInstIdServ", comp_inst_id_serv);
    }
    if (disconnect_date != null) {
      addInput("DisconnectDate", disconnect_date);
    }
  }


/**
 *
 * Sets the CompInstId
 * @param comp_inst_idIn Value of the comp_inst_id
 *
 */

  public void setCompInstId(Integer comp_inst_idIn) {
    comp_inst_id = comp_inst_idIn;
  }

/**
 *
 * Sets the CompInstIdServ
 * @param comp_inst_id_servIn Value of the comp_inst_id_serv
 *
 */

  public void setCompInstIdServ(Integer comp_inst_id_servIn) {
    comp_inst_id_serv = comp_inst_id_servIn;
  }

/**
 *
 * Sets the DisconnectDate
 * @param disconnect_dateIn Value of the disconnect_date
 *
 */

  public void setDisconnectDate(Date disconnect_dateIn) {
    disconnect_date = disconnect_dateIn;
  }

  public void translateFromMap() {
    comp_inst_id = (Integer)inputMap.get("CompInstId");
    comp_inst_id_serv = (Integer)inputMap.get("CompInstIdServ");
    disconnect_date = (Date)inputMap.get("DisconnectDate");
  }

/**
 *
 * Gets the CompInstId
 * @return Value of the CompInstId
 *
 */

  public Integer getCompInstId( ) {
    return comp_inst_id;
  }

/**
 *
 * Gets the CompInstIdServ
 * @return Value of the CompInstIdServ
 *
 */

  public Integer getCompInstIdServ( ) {
    return comp_inst_id_serv;
  }

/**
 *
 * Gets the DisconnectDate
 * @return Value of the DisconnectDate
 *
 */

  public Date getDisconnectDate( ) {
    return disconnect_date;
  }

}
