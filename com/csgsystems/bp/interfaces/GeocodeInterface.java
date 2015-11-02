
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
public interface GeocodeInterface extends BaliInterface {

  /**
   * Find Geocodes for the supplied address info..
   * Convenience method using default BSDMSessionContext.
   * @param GeocodeAddress Input  Object.
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GeocodeObjectDataList find (GeocodeAddressObjectData GeocodeAddress) throws BSDMResourceException;
  /**
   * Find Geocodes for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param GeocodeAddress Input  Object.
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GeocodeObjectDataList find (BSDMSessionContext context, GeocodeAddressObjectData GeocodeAddress) throws BSDMResourceException;


  /**
   * Find Geocodes for the supplied address info..
   * Convenience method using default BSDMSessionContext.
   * @param GeocodeAddress Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GeocodeObjectDataList find (GeocodeAddressObjectData GeocodeAddress, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Geocodes for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param GeocodeAddress Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GeocodeObjectDataList find (BSDMSessionContext context, GeocodeAddressObjectData GeocodeAddress, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Geocode Components for the supplied address info..
   * Convenience method using default BSDMSessionContext.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GeocodeComponentsObjectDataList componentsFind (String City, String County, String State) throws BSDMResourceException;
  /**
   * Find Geocode Components for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GeocodeComponentsObjectDataList componentsFind (BSDMSessionContext context, String City, String County, String State) throws BSDMResourceException;


  /**
   * Find Geocode Components for the supplied address info..
   * Convenience method using default BSDMSessionContext.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GeocodeComponentsObjectDataList componentsFind (String City, String County, String State, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Geocode Components for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GeocodeComponentsObjectDataList componentsFind (BSDMSessionContext context, String City, String County, String State, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convert Vertex Geocode to FX Geocode..
   * Convenience method using default BSDMSessionContext.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public String convertGeocode (Integer CountryCode, Integer FranchiseCode, String VertexGeocode) throws BSDMResourceException;
  /**
   * Convert Vertex Geocode to FX Geocode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public String convertGeocode (BSDMSessionContext context, Integer CountryCode, Integer FranchiseCode, String VertexGeocode) throws BSDMResourceException;


  /**
   * Convert Vertex Geocode to FX Geocode..
   * Convenience method using default BSDMSessionContext.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public String convertGeocode (Integer CountryCode, Integer FranchiseCode, String VertexGeocode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Convert Vertex Geocode to FX Geocode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public String convertGeocode (BSDMSessionContext context, Integer CountryCode, Integer FranchiseCode, String VertexGeocode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
