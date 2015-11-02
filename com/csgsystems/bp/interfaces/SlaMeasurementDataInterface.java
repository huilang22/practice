
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface SlaMeasurementDataInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param SlaMeasurementDataGetIn Input Object Key.
   * @return SlaMeasurementDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SlaMeasurementDataObjectData get (SlaMeasurementDataObjectKeyData SlaMeasurementDataGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param SlaMeasurementDataGetIn Input Object Key.
   * @return SlaMeasurementDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SlaMeasurementDataObjectData get (BSDMSessionContext context, SlaMeasurementDataObjectKeyData SlaMeasurementDataGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param SlaMeasurementDataGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SlaMeasurementDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SlaMeasurementDataObjectData get (SlaMeasurementDataObjectKeyData SlaMeasurementDataGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param SlaMeasurementDataGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SlaMeasurementDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SlaMeasurementDataObjectData get (BSDMSessionContext context, SlaMeasurementDataObjectKeyData SlaMeasurementDataGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param SlaMeasurementDataFindIn Input Filter Object.
   * @return SlaMeasurementDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SlaMeasurementDataObjectDataList find (SlaMeasurementDataObjectFilter SlaMeasurementDataFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param SlaMeasurementDataFindIn Input Filter Object.
   * @return SlaMeasurementDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SlaMeasurementDataObjectDataList find (BSDMSessionContext context, SlaMeasurementDataObjectFilter SlaMeasurementDataFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param SlaMeasurementDataFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SlaMeasurementDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SlaMeasurementDataObjectDataList find (SlaMeasurementDataObjectFilter SlaMeasurementDataFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param SlaMeasurementDataFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SlaMeasurementDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SlaMeasurementDataObjectDataList find (BSDMSessionContext context, SlaMeasurementDataObjectFilter SlaMeasurementDataFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
